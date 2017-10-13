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
        System.out.println(Arrays.deepToString(allItemsOnTransaction.getLineTotal()));
    }


    
}
