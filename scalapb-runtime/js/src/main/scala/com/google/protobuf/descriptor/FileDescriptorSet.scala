// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor



/** The protocol compiler can output a FileDescriptorSet containing the .proto
  * files it parses.
  */
@SerialVersionUID(0L)
final case class FileDescriptorSet(
    file: scala.collection.Seq[com.google.protobuf.descriptor.FileDescriptorProto] = Nil
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[FileDescriptorSet] with com.trueaccord.lenses.Updatable[FileDescriptorSet] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      file.foreach(file => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(file.serializedSize) + file.serializedSize)
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      file.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.FileDescriptorSet = {
      val __file = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.FileDescriptorProto] ++= this.file)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __file += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.FileDescriptorProto.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.FileDescriptorSet(
          file = __file.result()
      )
    }
    def clearFile = copy(file = scala.collection.Seq.empty)
    def addFile(__vs: com.google.protobuf.descriptor.FileDescriptorProto*): FileDescriptorSet = addAllFile(__vs)
    def addAllFile(__vs: TraversableOnce[com.google.protobuf.descriptor.FileDescriptorProto]): FileDescriptorSet = copy(file = file ++ __vs)
    def withFile(__v: scala.collection.Seq[com.google.protobuf.descriptor.FileDescriptorProto]): FileDescriptorSet = copy(file = __v)
    def getField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => file
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.FileDescriptorSet
}

object FileDescriptorSet extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FileDescriptorSet] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FileDescriptorSet] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.FileDescriptorSet = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.FileDescriptorSet(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.FileDescriptorProto]]
    )
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == javaDescriptor, "FieldDescriptor does not match message type.")
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 1 => __out = com.google.protobuf.descriptor.FileDescriptorProto
    }
  __out
  }
  def enumCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.descriptor.FileDescriptorSet(
  )
  implicit class FileDescriptorSetLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FileDescriptorSet]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.FileDescriptorSet](_l) {
    def file: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.FileDescriptorProto]] = field(_.file)((c_, f_) => c_.copy(file = f_))
  }
  final val FILE_FIELD_NUMBER = 1
}