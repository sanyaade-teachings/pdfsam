/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 27/mar/2012
 * Copyright 2012 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.support;

/**
 * Utility class to perform assertions
 * 
 * @author Andrea Vacondio
 * 
 */
public final class RequireUtils {

    private RequireUtils() {
        // hide
    }

    /**
     * throws an {@link IllegalArgumentException} if the condition is false
     * 
     * @param condition
     * @param errorMessage
     */
    public static void require(boolean condition, String errorMessage) {
        if (!condition) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    /**
     * throws an {@link IllegalArgumentException} if the input argument is null
     * 
     * @param arg
     * @param errorMessage
     */
    public static void requireNotNull(Object arg, String errorMessage) {
        require(arg != null, errorMessage);
    }

}
