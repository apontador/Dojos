#import "ContratoTest.h"
#import "Contrato.h"

@implementation ContratoTest

- (void)setUp
{
    [super setUp];
    
}

- (void)tearDown
{
    // Tear-down code here.
    
    [super tearDown];
}

- (void)testeValorVazio
{
    
    Contrato * contrato  = [[Contrato alloc] init];
    NSString* resultado = [contrato verificaDigito:@"1" valor:@""];

    STAssertEquals(@"", resultado, nil);
}

- (void)testeValor5
{
    
    Contrato * contrato  = [[Contrato alloc] init];
    NSString* resultado = [contrato verificaDigito:@"1" valor:@"5"];
    
    STAssertEqualObjects(@"5", resultado, nil);
}

- (void)testeValor52Digito2
{
    Contrato * contrato  = [[Contrato alloc] init];
    NSString* resultado = [contrato verificaDigito:@"2" valor:@"52"];
    STAssertEqualObjects(@"5", resultado, nil);
}

- (void)testeValor5000Digito5
{
    Contrato * contrato  = [[Contrato alloc] init];
    NSString* resultado = [contrato verificaDigito:@"5" valor:@"5000"];
    
    STAssertEqualObjects(@"0", resultado, nil);
}

- (void)testeValor2030Digito2
{
    Contrato * contrato  = [[Contrato alloc] init];
    NSString* resultado = [contrato verificaDigito:@"2" valor:@"2030"];
    STAssertEqualObjects(@"30", resultado, nil);
}

@end
