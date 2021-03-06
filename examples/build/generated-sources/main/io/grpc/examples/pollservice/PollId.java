// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: poll_service.proto

package io.grpc.examples.pollservice;

/**
 * Protobuf type {@code grpc.example.pollservice.PollId}
 */
public  final class PollId extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.example.pollservice.PollId)
    PollIdOrBuilder {
  // Use PollId.newBuilder() to construct.
  private PollId(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private PollId() {
    value_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PollId(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            value_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.pollservice.PollServiceProto.internal_static_grpc_example_pollservice_PollId_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.pollservice.PollServiceProto.internal_static_grpc_example_pollservice_PollId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.pollservice.PollId.class, io.grpc.examples.pollservice.PollId.Builder.class);
  }

  public static final com.google.protobuf.Parser<PollId> PARSER =
      new com.google.protobuf.AbstractParser<PollId>() {
    public PollId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PollId(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<PollId> getParserForType() {
    return PARSER;
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private java.lang.Object value_;
  /**
   * <code>optional string value = 1;</code>
   */
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string value = 1;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!getValueBytes().isEmpty()) {
      output.writeBytes(1, getValueBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getValueBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getValueBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.examples.pollservice.PollId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.pollservice.PollId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.pollservice.PollId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.pollservice.PollId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.pollservice.PollId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.pollservice.PollId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.pollservice.PollId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.examples.pollservice.PollId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.pollservice.PollId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.pollservice.PollId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(io.grpc.examples.pollservice.PollId prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.example.pollservice.PollId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.example.pollservice.PollId)
      io.grpc.examples.pollservice.PollIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.pollservice.PollServiceProto.internal_static_grpc_example_pollservice_PollId_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.pollservice.PollServiceProto.internal_static_grpc_example_pollservice_PollId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.pollservice.PollId.class, io.grpc.examples.pollservice.PollId.Builder.class);
    }

    // Construct using io.grpc.examples.pollservice.PollId.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      value_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.pollservice.PollServiceProto.internal_static_grpc_example_pollservice_PollId_descriptor;
    }

    public io.grpc.examples.pollservice.PollId getDefaultInstanceForType() {
      return io.grpc.examples.pollservice.PollId.getDefaultInstance();
    }

    public io.grpc.examples.pollservice.PollId build() {
      io.grpc.examples.pollservice.PollId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.examples.pollservice.PollId buildPartial() {
      io.grpc.examples.pollservice.PollId result = new io.grpc.examples.pollservice.PollId(this);
      result.value_ = value_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.pollservice.PollId) {
        return mergeFrom((io.grpc.examples.pollservice.PollId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.pollservice.PollId other) {
      if (other == io.grpc.examples.pollservice.PollId.getDefaultInstance()) return this;
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.examples.pollservice.PollId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.pollservice.PollId) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <code>optional string value = 1;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string value = 1;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string value = 1;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string value = 1;</code>
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>optional string value = 1;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.example.pollservice.PollId)
  }

  // @@protoc_insertion_point(class_scope:grpc.example.pollservice.PollId)
  private static final io.grpc.examples.pollservice.PollId defaultInstance;static {
    defaultInstance = new io.grpc.examples.pollservice.PollId();
  }

  public static io.grpc.examples.pollservice.PollId getDefaultInstance() {
    return defaultInstance;
  }

  public io.grpc.examples.pollservice.PollId getDefaultInstanceForType() {
    return defaultInstance;
  }

}

