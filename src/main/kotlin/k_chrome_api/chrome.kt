package k_chrome_api

@JsName("chrome")
external object chrome {
    object tabs {
        fun query(sample: Tab, fn: (Array<Tab>) -> Unit)
    }
}

data class Tab(
        val url: String? = null,
        val active: Boolean = true,
        val currentWindow: Boolean = true
)