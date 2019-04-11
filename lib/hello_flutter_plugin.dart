import 'dart:async';

import 'package:flutter/services.dart';

class HelloFlutterPlugin {
  static const MethodChannel _channel =
      const MethodChannel('hello_flutter_plugin');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static Future<String> trim(String string) async {
    final String s = await _channel.invokeMethod('trim',[string]);
    return s;
  }
}
