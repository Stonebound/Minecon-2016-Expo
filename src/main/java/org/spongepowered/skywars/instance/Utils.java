/**
 * This file is part of Special, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <http://github.com/SpongePowered>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.special.instance;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.living.player.Player;

import java.util.ArrayList;

class Utils {

    static void resetHealthHungerAndPotions(Player player) {
        player.offer(Keys.HEALTH, player.getValue(Keys.MAX_HEALTH).orElse(null).getMaxValue());
        resetHungerAndPotions(player);
    }

    private static void resetHungerAndPotions(Player player) {
        player.offer(Keys.FOOD_LEVEL, player.getValue(Keys.FOOD_LEVEL).orElse(null).getMaxValue());
        player.offer(Keys.SATURATION, player.getValue(Keys.SATURATION).orElse(null).getMaxValue());
        player.offer(Keys.EXHAUSTION, player.getValue(Keys.EXHAUSTION).orElse(null).getMaxValue());
        player.offer(Keys.POTION_EFFECTS, new ArrayList<>());
    }

}
