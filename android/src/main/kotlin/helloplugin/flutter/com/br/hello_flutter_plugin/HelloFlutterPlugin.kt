package helloplugin.flutter.com.br.hello_flutter_plugin

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar
import org.apache.commons.lang3.StringUtils

class HelloFlutterPlugin: MethodCallHandler {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      val channel = MethodChannel(registrar.messenger(), "hello_flutter_plugin")
      channel.setMethodCallHandler(HelloFlutterPlugin())
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    if (call.method == "getPlatformVersion") {
      result.success("Android ${android.os.Build.VERSION.RELEASE}")
    }else if (call.method == "trim") {
      val len = StringUtils.length("Ricardo Rodrigues Lecheta")
      result.success("$len")
    }else if (call.method == "v4") {
      result.success("v4")
    } else {
      //v1
      result.notImplemented()
    }
  }
}
