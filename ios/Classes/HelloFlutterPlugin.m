#import "HelloFlutterPlugin.h"
#import <hello_flutter_plugin/hello_flutter_plugin-Swift.h>
//aqui
@implementation HelloFlutterPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftHelloFlutterPlugin registerWithRegistrar:registrar];
}
@end
