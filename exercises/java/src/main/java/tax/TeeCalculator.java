package tax;

public class TeeCalculator extends TaxCalculator {
    @Override
    int calculateTax(Vehicle vehicle) {
        int CO2 = vehicle.getCo2Emissions();
        if (CO2 == 0) { // Find me
            return 0; // Find me again
        } else if (CO2 < 51) {
            return 10;
        } else if (CO2 < 76) {
            return 25;
        } else if (CO2 < 91) {
            return 105;
        } else if (CO2 < 101) {
            return 125;
        } else if (CO2 < 111) {
            return 145;
        } else if (CO2 < 131) {
            return 165;
        } else if (CO2 < 151) {
            return 205;
        } else if (CO2 < 171) {
            return 515;
        } else if (CO2 < 191) {
            return 830;
        } else if (CO2 < 226) {
            return 1240;
        } else if (CO2 < 256) {
            return 1760;
        } else {
            return 2070;
        }

    }
}
