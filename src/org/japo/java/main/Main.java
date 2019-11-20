/* 
 * Copyright 2019 Manu Portolés Zagalá.
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
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Constantes
        final int NUM_ESTACIONES = 4;
        final double MAX_MCG = 700;
        final double MIN_MCG = 0;

        double mcgNo;

        for (int estAct = 0; estAct < NUM_ESTACIONES; estAct++) {

            mcgNo = RND.nextDouble() * (MAX_MCG - MIN_MCG) + MIN_MCG;

            System.out.printf(Locale.ENGLISH, "%s %d %s %6.2f %s%n",
                    "Estación", estAct + 1, "...:", mcgNo, "mcg NO2");
        }

    }

}
