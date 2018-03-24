package com.blockchain.model;

import com.blockchain.security.RSACoder;

import java.util.Map;

public class Wallet {
    //公钥
    public String publicKey;

    //私钥
    public String privateKey;

    public Wallet(String publicKey, String privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public static Wallet generateWallet(){
        Map<String,Object> initKey;

        try {
            initKey = RSACoder.initKey();
            String publicKey = RSACoder.getPublicKey(initKey);
            String privateKey = RSACoder.getPrivateKey(initKey);
            return new Wallet(publicKey,privateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
