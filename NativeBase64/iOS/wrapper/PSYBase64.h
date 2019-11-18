//
//  PSYTurboBase64.h
//  TurboBase64
//
//  Created by Piasy on 2019/11/18.
//  Copyright © 2019 Piasy. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface PSYBase64 : NSObject

+ (NSString*)encodeString:(NSString*)src;

+ (NSString*)decodeString:(NSString*)src;

@end

NS_ASSUME_NONNULL_END
