package io.github.highright1234.alphaomega

import kotlinx.serialization.Serializable

@Serializable(with = MessageSerializer::class)
data class MessageData(val clazz: Int, val message: Message)