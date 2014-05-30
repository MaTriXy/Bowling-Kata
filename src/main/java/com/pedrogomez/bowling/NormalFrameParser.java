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
 * FrameParser implementation created to return a NormalFrame if the frame analyzed contains is a valid NormalFrame.
 * This FrameParser will return null if the analyzed frame is not an valid NormalFrame.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class NormalFrameParser implements FrameParser {

    private static final String ZERO = "-";

    @Override
    public Frame evaluate(String frame) {
        Frame result = null;
        if (isValidFrame(frame)) {
            int firstThrow = getScore(frame.charAt(0) + "");
            int secondThrow = getScore(frame.charAt(1) + "");
            result = getFrame(firstThrow, secondThrow);
        }
        return result;
    }

    private boolean isValidFrame(String frame) {
        return frame.length() == 2;
    }

    private Frame getFrame(int firstThrow, int secondThrow) {
        return new NormalFrame(firstThrow, secondThrow);
    }

    private int getScore(String partialFrame) {
        int score = 0;
        if (!ZERO.equals(partialFrame)) {
            score = Integer.parseInt(partialFrame);
        }
        return score;
    }
}
