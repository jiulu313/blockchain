package com.blockchain.model;

import java.util.List;

public class Block {
    //区块索引
    public int index;
    //当前区块的hash值，区块唯一标识
    public String hash;
    //生成区块的时间
    public long timestamp;
    //当前区块的交易集合
    public List<Transaction> transactions;
    //工作量证明，计算正确hash值的次数
    public int nonce;
    //前一个区块的hash值
    public String previousHash;

    public Block(){

    }

    public Block(int index,long timestamp,List<Transaction> transactions,int nonce,String previousHash,String hash){
        this.index = index;
        this.timestamp = timestamp;
        this.transactions = transactions;
        this.nonce = nonce;
        this.previousHash = previousHash;
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "[ index:" + index + " hash:"+hash+ " timestamp:"+timestamp+" transactions:"+transactions.toString() + " nonce:"+nonce+" prehash:"+previousHash + " ]";
    }
}
