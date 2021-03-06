/*
 * Copyright (c) 2011-2018, Meituan Dianping. All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dianping.zebra.shard.config;

import java.io.Serializable;
import java.util.List;

public class TableShardRuleConfig implements Serializable {

	private String tableName;

	private List<TableShardDimensionConfig> dimensionConfigs;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<TableShardDimensionConfig> getDimensionConfigs() {
		return dimensionConfigs;
	}

	public void setDimensionConfigs(List<TableShardDimensionConfig> dimensionConfigs) {
		this.dimensionConfigs = dimensionConfigs;
	}
}
