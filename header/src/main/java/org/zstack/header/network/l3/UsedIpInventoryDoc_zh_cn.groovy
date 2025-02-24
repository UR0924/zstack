package org.zstack.header.network.l3

import java.lang.Integer
import java.sql.Timestamp

doc {

	title "已使用IP的结构清单"

	field {
		name "uuid"
		desc "资源的UUID，唯一标示该资源"
		type "String"
		since "5.0.0"
	}
	field {
		name "ipRangeUuid"
		desc "IP段UUID"
		type "String"
		since "5.0.0"
	}
	field {
		name "l3NetworkUuid"
		desc "三层网络UUID"
		type "String"
		since "5.0.0"
	}
	field {
		name "ipVersion"
		desc ""
		type "Integer"
		since "5.0.0"
	}
	field {
		name "ip"
		desc ""
		type "String"
		since "5.0.0"
	}
	field {
		name "netmask"
		desc ""
		type "String"
		since "5.0.0"
	}
	field {
		name "gateway"
		desc ""
		type "String"
		since "5.0.0"
	}
	field {
		name "usedFor"
		desc "分配原因"
		type "String"
		since "5.0.0"
	}
	field {
		name "ipInLong"
		desc ""
		type "long"
		since "5.0.0"
	}
	field {
		name "ipInBinary"
		desc ""
		type "byte[]"
		since "5.2.0"
	}
	field {
		name "vmNicUuid"
		desc "云主机网卡UUID"
		type "String"
		since "5.0.0"
	}
	field {
		name "createDate"
		desc "创建时间"
		type "Timestamp"
		since "5.0.0"
	}
	field {
		name "lastOpDate"
		desc "最后一次修改时间"
		type "Timestamp"
		since "5.0.0"
	}
}
