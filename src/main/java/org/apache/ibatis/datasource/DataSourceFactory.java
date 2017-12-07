/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.datasource;

import java.util.Properties;

import javax.sql.DataSource;

/**
 * 数据源接口（默认实现3种数据源：PooledDataSourceFactory，UnpooledDataSourceFactory， JndiDataSourceFactory）
 * 如需自定义数据源，需要实现该接口
 *
 * @author Clinton Begin
 * @modify muse
 */
public interface DataSourceFactory {

    void setProperties(Properties props);

    DataSource getDataSource();

}
