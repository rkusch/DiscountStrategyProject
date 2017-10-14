/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;
import java.util.Arrays;

/**
 *
 * @author rkusch
 */
public class TransactionOuputToReceipt implements TransactionOutput {

    @Override
    public void outputEntireTransaction(LineTotal allItemsOnTransaction) {
        
        //this works to output all itemms to one multidimensional array
        //System.out.println(Arrays.deepToString(allItemsOnTransaction.getLineTotal()));
        System.out.println("Welcome to Kohls");
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Product\t\t\t\tPrice\t\tDiscount\tQty\t\tTotal Price");
        System.out.println("-------\t\t\t\t-----\t\t--------\t---\t\t-----------");
        for (int oneLineTotal = 0; oneLineTotal <allItemsOnTransaction.getLineTotal().length; oneLineTotal++ ) {
            for (int oneColumnInLineTotal = 0; oneColumnInLineTotal < allItemsOnTransaction.getNUMBER_OF_COLUMNS_PER_LINE(); oneColumnInLineTotal++) {
                System.out.print(allItemsOnTransaction.getLineTotal()[oneLineTotal][oneColumnInLineTotal] + "\t\t"); 
            }
            System.out.print("\n");
     
        }
//        System.out.println("");
//        
//        System.out.println(Arrays.deepToString(allItemsOnTransaction.getLineTotal()));
    }


    
}
