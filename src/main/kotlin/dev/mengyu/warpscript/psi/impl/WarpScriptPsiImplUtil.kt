package dev.mengyu.warpscript.psi.impl

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import dev.mengyu.psi.WarpScriptFuncCallExpr

object WarpScriptPsiImplUtil {

    private val functions = {
        val mapper = JsonMapper.builder().addModule(KotlinModule()).build()
        val json = this::class.java.classLoader.getResource("functions.json").readText()
        mapper.readValue<Map<String, Function>>(json)
    }()

    private val functionNames = functions.keys

    fun isNative(element: WarpScriptFuncCallExpr): Boolean {
        return functionNames.contains(element.text)
    }

    fun isNative(token: String): Boolean {
        return functionNames.contains(token)
    }

}

data class Function(
    val description: String,
    val signature: String,
    val tags: Set<String>,
    val since: String,
    val OPB64name: String
)

data class Signature(val parameters: Parameter, val returnType: Parameter)

data class Parameter(val name: String, val type: String, var value: Parameter? = null)