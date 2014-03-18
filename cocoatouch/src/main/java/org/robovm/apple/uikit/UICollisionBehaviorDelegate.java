/*
 * Copyright (C) 2014 Trillian AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UICollisionBehaviorDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "collisionBehavior:beganContactForItem:withItem:atPoint:")
    void collisionBehavior$beganContactForItem$withItem$atPoint$(UICollisionBehavior behavior, UIDynamicItem item1, UIDynamicItem item2, @ByVal CGPoint p);
    @Method(selector = "collisionBehavior:endedContactForItem:withItem:")
    void collisionBehavior$endedContactForItem$withItem$(UICollisionBehavior behavior, UIDynamicItem item1, UIDynamicItem item2);
    @Method(selector = "collisionBehavior:beganContactForItem:withBoundaryIdentifier:atPoint:")
    void collisionBehavior$beganContactForItem$withBoundaryIdentifier$atPoint$(UICollisionBehavior behavior, UIDynamicItem item, NSObject identifier, @ByVal CGPoint p);
    @Method(selector = "collisionBehavior:endedContactForItem:withBoundaryIdentifier:")
    void collisionBehavior$endedContactForItem$withBoundaryIdentifier$(UICollisionBehavior behavior, UIDynamicItem item, NSObject identifier);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}