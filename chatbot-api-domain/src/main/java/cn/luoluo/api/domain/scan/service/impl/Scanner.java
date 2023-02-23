package cn.luoluo.api.domain.scan.service.impl;

import cn.luoluo.api.domain.scan.service.IScanner;

public class Scanner implements IScanner {

    @Override
    public String question() {
        //具体实现
        return "写一个java冒泡排序";
    }
}
