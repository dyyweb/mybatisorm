package org.wsh.common.orm.mysql.mybatis.base;

import org.wsh.common.orm.mysql.mybatis.bean.TableWapper;

/**
 * author: wsh
 * JDK-version:  JDK1.8
 * comments:  对此类的描述，可以引用系统设计中的描述
 * since Date： 2016-11-16 15:59
 */
public interface BuildFactory {

    public void buildTable(TableWapper tableWapper);
}
