@file:Suppress("unused", "NOTHING_TO_INLINE", "FunctionName", "UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

inline fun <T> JsObj(): T = js("{}") as T
inline fun JsObj(): JsObj = js("{}") as JsObj

external interface JsObj {
    operator fun get(key: String): dynamic
    operator fun set(s: String, value: dynamic)
}
