/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.util.ArrayList;

/**
 *
 * @author antonio
 */
public class Sample {

    /**
     * @param args the command line arguments
     */
    
    ArrayList<Block> blockchain = new ArrayList<>();
    
    public static void main(String[] args) {
        String[] genesisTransaction = {"Satoshi sent Antoino 10 bitcoins"};
        Block genesisBlock = new Block(0, genesisTransaction);
        System.out.println("asa");
        System.out.println(genesisBlock.getBlockHash());
    }
    
}
