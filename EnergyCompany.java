public class EnergyCompany {
   public void applyDiscount(int numberPost, double discountPercentage) {
       //  we need to retrieve the energy bill of the user associated with the light post with the specified number
       double energyBill = getEnergyBill(numberPost);

       //  Calculate the discount amount to be applied
       double discountAmount = energyBill * (discountPercentage / 100);

       // Subtract the amount of the discount from the total amount of the user's energy bill
       double discountedEnergyBill = energyBill - discountAmount;

       // we need to save user's updated energy bill value in database or other account management system
       saveEnergyBill(numberPost, discountedEnergyBill);

    }
}