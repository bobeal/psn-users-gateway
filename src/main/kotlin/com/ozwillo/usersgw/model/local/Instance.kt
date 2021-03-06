package com.ozwillo.usersgw.model.local

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "instance")
data class Instance(
        @Field("organization_id") val organizationId: String,
        @Field("instance_id") val instanceId: String,
        @Field("creator_id") val creatorId: String,
        @Field("service_id") val serviceId: String,
        @Id var _id: ObjectId = ObjectId.get()
)