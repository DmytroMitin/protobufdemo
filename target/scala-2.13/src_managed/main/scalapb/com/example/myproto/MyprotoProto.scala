// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.example.myproto

object MyprotoProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.wrappers.WrappersProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.example.myproto.MyClass
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Cg1teXByb3RvLnByb3RvEgtjb20uZXhhbXBsZRoeZ29vZ2xlL3Byb3RvYnVmL3dyYXBwZXJzLnByb3RvIrECCgdNeUNsYXNzE
  hcKAmkwGAEgASgFQgfiPwQSAmkwUgJpMBIZCgFpGAIgASgFQgbiPwMSAWlIAFIBaYgBARIXCgJzMBgDIAEoCUIH4j8EEgJzMFICc
  zASGQoBcxgEIAEoCUIG4j8DEgFzSAFSAXOIAQESFwoCZDAYBSABKAFCB+I/BBICZDBSAmQwEhkKAWQYBiABKAFCBuI/AxIBZEgCU
  gFkiAEBEjUKAmQxGAcgASgLMhwuZ29vZ2xlLnByb3RvYnVmLkRvdWJsZVZhbHVlQgfiPwQSAmQxUgJkMRI6CgJkMhgIIAEoCzIcL
  mdvb2dsZS5wcm90b2J1Zi5Eb3VibGVWYWx1ZUIH4j8EEgJkMkgDUgJkMogBAUIECgJfaUIECgJfc0IECgJfZEIFCgNfZDJiBnByb
  3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.protobuf.wrappers.WrappersProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}