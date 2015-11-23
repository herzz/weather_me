package com.zahirherz.weatherme.weather;

import java.util.Random;

public class WeatherFact {
    public String[] facts = {
            "Al'Aziziyah in Libya has the highest recorded temperature on earth at a sweltering 58°C / 136.4°F on the 13th Sept, 1922.",
            "The lowest ever recorded world temperature was at Vostok Station, Antarctica on the 21 July 1983 at a bitter -89.6°C / -129.28°F",
            "Mawsynram in India is noted as being the wettest place on earth is with over 11 meters of rain falling every year.",
            "Antofagasta in Chile is the driest place on the planet getting less than 0.1mm per year, and with many years having no rainfall whatsoever.",
            "Yuma in the state of Arizona has over 4,000 hours of sunshine per year - making it the sunniest place on the planet!",
            "The South Pole is the least sunny place - only 182 days a year get sunshine.",
            "The windiest place on earth is Commonwealth Bay, Antarctica where winds of 200mph have been recorded.",
            "The strongest ever recorded wind was on Mt Washington, New Hampshire, USA at an amazing 231mph.",
            "Nearly 2,000 thunderstorm cells are estimated over the planet at any given time.",
            "The U.S. has over 100,000 thunderstorms every year, with over 16 million taking place across the world in a year.",
            "9 out of 10 lightning bolts strike land rather than oceans.",
            "A storm named John was the Longest-lasting Pacific tropical storm continuing for 31 days. As it crossed the dateline twice, it changed status from a hurricane to a typhoon and back to a hurricane.",
            "'Ginger', was the longest-lasting Atlantic tropical storm, which spun around the open ocean for 28 days in 1971.",
            "The world's largest snowflake was recorded in the Guinness Book of Records, at 38 cm wide and 20 cm thick. The snow flake fell at Fort Keogh, Montana, USA on 28 January 1887.",
            "With tyres for his mouth and trees for arms, ‘Angus’ - the tallest snowman, was made by residents of Bethel, Maine, USA, measuring a whopping 34.63 metres / 113.6 feet. ‘Angus’ took 2 weeks to build, and was completed on 17 February 1999.",
            "The greatest snowfall recorded was on Mt Rainier, Washington State, USA - Over 30 metres / 98.4 feet fell during the winter of 1972.",
            "On 14th April, 1986 Bangladesh was hit by the biggest hail stones ever recorded - weighing in at over 1kg / 2.2lb each - killing 92 people."};

    public String getFact() {
        // randomly choose fact and display to user
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        fact = facts[randomNumber];
        return fact;
    }

}
