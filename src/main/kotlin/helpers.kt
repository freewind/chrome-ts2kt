@file:Suppress("unused", "NOTHING_TO_INLINE", "FunctionName")

inline fun <T> JsObj(): T = js("{}") as T