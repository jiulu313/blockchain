package com.blockchain.model;


/**
 * 交易输入
 */
public class TransactionInput {
    //前一次交易的id
    public String txId;

    //交易金额
    public int value;

    //交易签名
    public String signature;

    //交易发送方的钱包公钥
    public String publicKey;

    public TransactionInput(String txId, int value, String signature, String publicKey) {
        this.txId = txId;
        this.value = value;
        this.signature = signature;
        this.publicKey = publicKey;
    }
}
