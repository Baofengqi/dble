package io.mycat.route.handler;

import io.mycat.cache.LayerCachePool;
import io.mycat.config.model.SchemaConfig;
import io.mycat.config.model.SystemConfig;
import io.mycat.route.RouteResultset;
import io.mycat.server.ServerConnection;

import java.sql.SQLException;
import java.util.Map;

/**
 * 按照注释中包含指定类型的内容做路由解析
 * 
 */
public interface HintHandler {

	public RouteResultset route( SchemaConfig schema,
                                int sqlType, String realSQL, String charset, ServerConnection sc,
                                LayerCachePool cachePool, String hintSQLValue, int hintSqlType, Map hintMap)
			throws SQLException;
}
