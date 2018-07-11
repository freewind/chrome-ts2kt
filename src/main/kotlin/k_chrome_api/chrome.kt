@file:Suppress("unused", "ClassName", "PackageName")

package k_chrome_api

@JsName("object")
external class JsObj

typealias Callback = (dynamic) -> Unit

@JsName("chrome")
external object chrome {
    object tabs {
        fun get(tabId: Int, fn: Callback)
        fun getCurrent(callback: Callback)
        fun connect(tabId: Int, connectInfo: dynamic)
        fun sendRequest(tabId: Int, request: dynamic, responseCallback: Callback)
        fun sendMessage(tabId: Int, message: dynamic, options: JsObj, responseCallback: Callback)
        fun getSelected(windowId: Int, callback: Callback)
        fun getAllInWindow(windowId: Int, callback: Callback)
        fun create(createProperties: JsObj, callback: Callback)
        fun duplicate(tabId: Int, callback: Callback)
        fun query(queryInfo: Tab, callback: (Array<Tab>) -> Unit)
        fun highlight(highlightInfo: JsObj, callback: Callback)
        fun update(tabId: Int, updateProperties: JsObj, callback: Callback)
        fun move(tabIds: Array<Int>, moveProperties: JsObj, callback: Callback)
        fun reload(tabId: Int, reloadProperties: JsObj, callback: Callback)
        fun remove(tabIds: Array<Int>, callback: Callback)
        fun detectLanguage(tabId: Int, callback: Callback)
        fun captureVisibleTab(windowId: Int, options: JsObj, callback: Callback)
        fun executeScript(tabId: Int, details: JsObj, callback: Callback)
        fun insertCSS(tabId: Int, details: JsObj, callback: Callback)
        fun setZoom(tabId: Int, zoomFactor: Double, callback: Callback)
        fun getZoom(tabId: Int, callback: Callback)
        fun setZoomSettings(tabId: Int, zoomSettings: ZoomSettings, callback: Callback)
        fun getZoomSettings(tabId: Int, callback: Callback)
        fun discard(tabId: Int, callback: Callback)
    }
}

class ZoomSettings

data class Tab(
        val url: String? = null,
        val active: Boolean = true,
        val currentWindow: Boolean = true
)