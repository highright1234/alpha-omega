package io.github.highright1234.alphaomega

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object MessageSerializer: KSerializer<MessageData> {
    override val descriptor: SerialDescriptor
        get() = TODO("Not yet implemented")

    override fun deserialize(decoder: Decoder): MessageData {
        TODO("Not yet implemented")
    }

    override fun serialize(encoder: Encoder, value: MessageData) {
        TODO("Not yet implemented")
    }
}