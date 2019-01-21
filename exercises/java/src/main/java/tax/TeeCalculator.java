package tax;

public class TeeCalculator extends TaxCalculator {
    @Override
    int calculateTax(Vehicle vehicle) {
        int CO2 = vehicle.getCo2Emissions();
        int[] prices = taxtCalcTemplate(vehicle.getFuelType());

        if (CO2 == 0) {
            return prices[0];

        } else if (CO2 < 51) {
            return prices[1];

        } else if (CO2 < 76) {
            return prices[2];

        } else if (CO2 < 91) {
            return prices[3];

        } else if (CO2 < 101) {
            return prices[4];

        } else if (CO2 < 111) {
            return prices[5];

        } else if (CO2 < 131) {
            return prices[6];

        } else if (CO2 < 151) {
            return prices[7];

        } else if (CO2 < 171) {
            return prices[8];

        } else if (CO2 < 191) {
            return prices[9];

        } else if (CO2 < 226) {
            return prices[10];

        } else if (CO2 < 256) {
            return prices[11];

        } else {
            return prices[12];

        }

    }


    private int[] taxtCalcTemplate(FuelType gas) {

        switch(gas) {
            case PETROL:
                return new int[]{0,10,25,105,125,145,165,205,515,830,1240,1760,2070};
            case DIESEL:
                return new int[]{0,25,105,125,145,165,205,515,830,1240,1760,2070,2070};
            case ALTERNATIVE_FUEL:
                return new int[]{0,0,15,95,115,135,155,195,505,820,1230,1750,2060};

            default:
                return new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0};

        }
    }
}
