class SpaceAge {
    final double secondToYear = 0.000000031688087814029, // Conversion factor for seconds to Earth years
            yearMercury = 0.2408467,              // Orbital period of Mercury in Earth years
            yearVenus = 0.61519726,              // Orbital period of Venus in Earth years
            yearEarth = 1.0,                     // Orbital period of Earth in Earth years
            yearMars = 1.8808158,                // Orbital period of Mars in Earth years
            yearJupiter = 11.862615,             // Orbital period of Jupiter in Earth years
            yearSaturn = 29.447498,              // Orbital period of Saturn in Earth years
            yearUranus = 84.016846,              // Orbital period of Uranus in Earth years
            yearNeptune = 164.79132;             // Orbital period of Neptune in Earth years
    double seconds; // Variable to store the age in seconds

    SpaceAge(double seconds) { // Constructor for the SpaceAge class
        this.seconds = seconds; // Set the input seconds to the instance variable
    }

    double getSeconds() { // Method to convert seconds into Earth years
        return seconds * secondToYear; // Convert the age from seconds to Earth years
    }

    double onEarth() { // Method to calculate the age on Earth (in Earth years)
        return getSeconds() / yearEarth; // Return age on Earth in Earth years
    }

    double onMercury() { // Method to calculate the age on Mercury (in Mercury years)
        return getSeconds() / yearMercury; // Return age on Mercury in Mercury years
    }

    double onVenus() { // Method to calculate the age on Venus (in Venus years)
        return getSeconds() / yearVenus; // Return age on Venus in Venus years
    }

    double onMars() { // Method to calculate the age on Mars (in Mars years)
        return getSeconds() / yearMars; // Return age on Mars in Mars years
    }

    double onJupiter() { // Method to calculate the age on Jupiter (in Jupiter years)
        return getSeconds() / yearJupiter; // Return age on Jupiter in Jupiter years
    }

    double onSaturn() { // Method to calculate the age on Saturn (in Saturn years)
        return getSeconds() / yearSaturn; // Return age on Saturn in Saturn years
    }

    double onUranus() { // Method to calculate the age on Uranus (in Uranus years)
        return getSeconds() / yearUranus; // Return age on Uranus in Uranus years
    }

    double onNeptune() { // Method to calculate the age on Neptune (in Neptune years)
        return getSeconds() / yearNeptune; // Return age on Neptune in Neptune years
    }
}