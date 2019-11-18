//
//  PSYTurboBase64.m
//  TurboBase64
//
//  Created by Piasy on 2019/11/18.
//  Copyright © 2019 Piasy. All rights reserved.
//

#import "PSYBase64.h"

@implementation PSYBase64

+ (NSString*)encodeString:(NSString*)src {
    NSData* data = [src dataUsingEncoding:NSUTF8StringEncoding];
    return [data base64EncodedStringWithOptions:0];
}

+ (NSString*)decodeString:(NSString*)src {
    NSData* data = [[NSData alloc] initWithBase64EncodedString:src options:0];
    return [[NSString alloc] initWithData:data encoding:NSUTF8StringEncoding];
}

@end
