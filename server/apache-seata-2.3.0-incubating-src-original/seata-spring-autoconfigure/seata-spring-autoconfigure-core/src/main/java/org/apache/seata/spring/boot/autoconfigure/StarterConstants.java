/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.seata.spring.boot.autoconfigure;

import java.util.HashMap;

import org.apache.seata.config.ConfigurationKeys;


public interface StarterConstants {
    String SEATA_PREFIX = "seata";
    String SEATA_SPRING_CLOUD_ALIBABA_PREFIX = "spring.cloud.alibaba.seata";
    String TRANSPORT_PREFIX = SEATA_PREFIX + ".transport";
    String THREAD_FACTORY_PREFIX_KEBAB_STYLE = TRANSPORT_PREFIX + ".thread-factory";
    String THREAD_FACTORY_PREFIX = TRANSPORT_PREFIX + ".threadFactory";
    String SHUTDOWN_PREFIX = TRANSPORT_PREFIX + ".shutdown";
    String SERVICE_PREFIX = SEATA_PREFIX + ".service";
    String CLIENT_PREFIX = SEATA_PREFIX + ".client";
    String SAGA_PREFIX = SEATA_PREFIX + ".saga";
    String CLIENT_RM_PREFIX = CLIENT_PREFIX + ".rm";
    String CLIENT_TM_PREFIX = CLIENT_PREFIX + ".tm";
    String LOCK_PREFIX = CLIENT_RM_PREFIX + ".lock";
    String UNDO_PREFIX = CLIENT_PREFIX + ".undo";
    String LOAD_BALANCE_PREFIX_KEBAB_STYLE = CLIENT_PREFIX + ".load-balance";
    String LOAD_BALANCE_PREFIX = CLIENT_PREFIX + ".loadBalance";
    String HTTP_PREFIX = CLIENT_PREFIX + ".http";
    String LOG_PREFIX = SEATA_PREFIX + ".log";
    String COMPRESS_PREFIX = UNDO_PREFIX + ".compress";
    String TCC_PREFIX = SEATA_PREFIX + ".tcc";
    String TCC_FENCE_PREFIX = TCC_PREFIX + ".fence";
    String SAGA_STATE_MACHINE_PREFIX = SAGA_PREFIX + ".state-machine";
    String SAGA_ASYNC_THREAD_POOL_PREFIX = SAGA_STATE_MACHINE_PREFIX + ".async-thread-pool";

    String REGISTRY_PREFIX = SEATA_PREFIX + ".registry";
    String REGISTRY_PREFERED_NETWORKS = ConfigurationKeys.FILE_ROOT_REGISTRY + ".preferredNetworks";
    String REGISTRY_NACOS_PREFIX = REGISTRY_PREFIX + ".nacos";
    String REGISTRY_RAFT_PREFIX = REGISTRY_PREFIX + ".raft";
    String REGISTRY_EUREKA_PREFIX = REGISTRY_PREFIX + ".eureka";
    String REGISTRY_REDIS_PREFIX = REGISTRY_PREFIX + ".redis";
    String REGISTRY_ZK_PREFIX = REGISTRY_PREFIX + ".zk";
    String REGISTRY_CONSUL_PREFIX = REGISTRY_PREFIX + ".consul";
    String REGISTRY_NAMINGSERVER_PREFIX = REGISTRY_PREFIX + ".seata";
    String REGISTRY_ETCD3_PREFIX = REGISTRY_PREFIX + ".etcd3";
    String REGISTRY_SOFA_PREFIX = REGISTRY_PREFIX + ".sofa";
    String REGISTRY_CUSTOM_PREFIX = REGISTRY_PREFIX + ".custom";

    String CONFIG_PREFIX = SEATA_PREFIX + ".config";
    String CONFIG_NACOS_PREFIX = CONFIG_PREFIX + ".nacos";
    String CONFIG_CONSUL_PREFIX = CONFIG_PREFIX + ".consul";
    String CONFIG_ETCD3_PREFIX = CONFIG_PREFIX + ".etcd3";
    String CONFIG_APOLLO_PREFIX = CONFIG_PREFIX + ".apollo";
    String CONFIG_ZK_PREFIX = CONFIG_PREFIX + ".zk";
    String CONFIG_FILE_PREFIX = CONFIG_PREFIX + ".file";
    String CONFIG_CUSTOM_PREFIX = CONFIG_PREFIX + ".custom";


    String SERVER_PREFIX = SEATA_PREFIX + ".server";
    String SERVER_UNDO_PREFIX = SERVER_PREFIX + ".undo";
    String SERVER_RAFT_PREFIX = SERVER_PREFIX + ".raft";
    String SERVER_RAFT_SSL_PREFIX = SERVER_RAFT_PREFIX + ".ssl";
    String SERVER_RAFT_SSL_CLIENT_KEYSTORE_PREFIX = SERVER_RAFT_SSL_PREFIX + ".client.keystore";
    String SERVER_RAFT_SSL_SERVER_KEYSTORE_PREFIX = SERVER_RAFT_SSL_PREFIX + ".server.keystore";
    String SERVER_RECOVERY_PREFIX = SERVER_PREFIX + ".recovery";

    String METRICS_PREFIX = SEATA_PREFIX + ".metrics";

    String STORE_PREFIX = SEATA_PREFIX + ".store";
    String STORE_SESSION_PREFIX = STORE_PREFIX + ".session";
    String STORE_LOCK_PREFIX = STORE_PREFIX + ".lock";
    String STORE_FILE_PREFIX = STORE_PREFIX + ".file";
    String STORE_DB_PREFIX = STORE_PREFIX + ".db";
    String STORE_REDIS_PREFIX = STORE_PREFIX + ".redis";
    String STORE_REDIS_SINGLE_PREFIX = STORE_REDIS_PREFIX + ".single";
    String STORE_REDIS_SENTINEL_PREFIX = STORE_REDIS_PREFIX + ".sentinel";

    String SESSION_PREFIX = SERVER_PREFIX + ".session";

    String REGEX_SPLIT_CHAR = ";";


    int MAP_CAPACITY = 64;
    HashMap<String, Class<?>> PROPERTY_BEAN_MAP = new HashMap<>(MAP_CAPACITY);
    /**
     * The following special keys need to be normalized.
     */
    String SPECIAL_KEY_GROUPLIST = "grouplist";
    String SPECIAL_KEY_SERVICE = "service";
    String SPECIAL_KEY_VGROUP_MAPPING = "vgroupMapping";

}
