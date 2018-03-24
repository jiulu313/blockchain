package com.blockchain.model;

/**
 * 一笔交易
 */
public class Transaction {
    //交易唯一的id
    public String id;

    //交易输入
    public TransactionInput txIn;

    //交易输出
    public TransactionOutput txOut;


    public Transaction(String id, TransactionInput txIn, TransactionOutput txOut) {
        this.id = id;
        this.txIn = txIn;
        this.txOut = txOut;
    }
}
