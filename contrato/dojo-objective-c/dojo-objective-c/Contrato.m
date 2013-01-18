#import "Contrato.h"

@implementation Contrato
-(NSString*) verificaDigito: (NSString*) verificador valor:(NSString*) valor {
    
    if ([valor isEqualToString:@""]) {
        return @"";
    }
    
    NSString* resultado = [valor stringByReplacingOccurrencesOfString: verificador withString:@""];
    
    if ([resultado intValue] == 0) {
        return @"0";
    }
    
    resultado = [[[NSNumber alloc] initWithInt: [resultado intValue]] stringValue];
    
    return resultado;
}
@end
