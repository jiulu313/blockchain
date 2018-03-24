package com.blockchain;

import com.blockchain.model.Block;
import com.blockchain.model.Transaction;
import com.blockchain.security.CryptoUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**  1 创世块的建立  **/
        //创建一个区块链
        List<Block> blockchain = new ArrayList<>();
        //生成创世区块
        Block block = new Block(1, System.currentTimeMillis(), new ArrayList<Transaction>(), 1, "1", "1");
        //加入创世区块到区块链里
        blockchain.add(block);

        System.out.println(block);


        /** 2 加入新的区块  **/
        //1 创建一个空的交易的集合
        List<Transaction> txs = new ArrayList<>();
        Transaction tx1 = new Transaction();
        Transaction tx2 = new Transaction();
        txs.add(tx1);
        txs.add(tx2);

        //2 加入系统奖励的交易
        Transaction sysTx = new Transaction();
        txs.add(sysTx);

        //3 获取当前区块链里面的最一个区块
        Block latestBlock = blockchain.get(blockchain.size() - 1);

        //4 挖矿过程，其实就是计算hash的过程
        String hash = "";
        int nonce = 1;
        while (true) {
            hash = CryptoUtil.SHA256(latestBlock.hash + txs.toString() + nonce);
            if (hash.startsWith("0000")) {
                System.out.println("=======计算结果正确，计算次数为：" + nonce + " , hash:" + hash);
                break;
            }
            nonce++;
        }

        Block newBlock = new Block(latestBlock.index + 1,
                System.currentTimeMillis(),
                txs,
                nonce,
                latestBlock.hash,
                hash);

        blockchain.add(newBlock);
        System.out.println(blockchain);
    }
}
