/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pedrogomez.bowling;

/**
 * Interface created to represent one bowling frame. Different implementations will have to return different frames.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
interface FrameParser {

    /**
     * Evaluate the frame parameter and return null if no Frame matches with the parameter or one Frame if matches.
     *
     * @param frame to evaluate in string format.
     * @return frame transformed into an object.
     */
    Frame evaluate(String frame);

}
