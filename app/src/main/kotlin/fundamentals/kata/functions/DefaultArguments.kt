package fundamentals.kata.functions

object DefaultArguments {
    @JvmStatic
    fun openBrowser(url: String, incognitoMode: Boolean = false) {
       println("Opening $url" + if (incognitoMode) " in incognito mode" else "")
    }
}