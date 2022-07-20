// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetUpLunchBoxWidgetReq.proto

package emu.grasscutter.net.proto;

public final class SetUpLunchBoxWidgetReqOuterClass {
  private SetUpLunchBoxWidgetReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetUpLunchBoxWidgetReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetUpLunchBoxWidgetReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.LunchBoxData lunch_box_data = 6;</code>
     * @return Whether the lunchBoxData field is set.
     */
    boolean hasLunchBoxData();
    /**
     * <code>.LunchBoxData lunch_box_data = 6;</code>
     * @return The lunchBoxData.
     */
    emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getLunchBoxData();
    /**
     * <code>.LunchBoxData lunch_box_data = 6;</code>
     */
    emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4272
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SetUpLunchBoxWidgetReq}
   */
  public static final class SetUpLunchBoxWidgetReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetUpLunchBoxWidgetReq)
      SetUpLunchBoxWidgetReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetUpLunchBoxWidgetReq.newBuilder() to construct.
    private SetUpLunchBoxWidgetReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetUpLunchBoxWidgetReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetUpLunchBoxWidgetReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetUpLunchBoxWidgetReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 50: {
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder subBuilder = null;
              if (lunchBoxData_ != null) {
                subBuilder = lunchBoxData_.toBuilder();
              }
              lunchBoxData_ = input.readMessage(emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lunchBoxData_);
                lunchBoxData_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.class, emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.Builder.class);
    }

    public static final int LUNCH_BOX_DATA_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
    /**
     * <code>.LunchBoxData lunch_box_data = 6;</code>
     * @return Whether the lunchBoxData field is set.
     */
    @java.lang.Override
    public boolean hasLunchBoxData() {
      return lunchBoxData_ != null;
    }
    /**
     * <code>.LunchBoxData lunch_box_data = 6;</code>
     * @return The lunchBoxData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getLunchBoxData() {
      return lunchBoxData_ == null ? emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : lunchBoxData_;
    }
    /**
     * <code>.LunchBoxData lunch_box_data = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder() {
      return getLunchBoxData();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (lunchBoxData_ != null) {
        output.writeMessage(6, getLunchBoxData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lunchBoxData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getLunchBoxData());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq other = (emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq) obj;

      if (hasLunchBoxData() != other.hasLunchBoxData()) return false;
      if (hasLunchBoxData()) {
        if (!getLunchBoxData()
            .equals(other.getLunchBoxData())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasLunchBoxData()) {
        hash = (37 * hash) + LUNCH_BOX_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getLunchBoxData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 4272
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SetUpLunchBoxWidgetReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetUpLunchBoxWidgetReq)
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.class, emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (lunchBoxDataBuilder_ == null) {
          lunchBoxData_ = null;
        } else {
          lunchBoxData_ = null;
          lunchBoxDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq build() {
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq buildPartial() {
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq result = new emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq(this);
        if (lunchBoxDataBuilder_ == null) {
          result.lunchBoxData_ = lunchBoxData_;
        } else {
          result.lunchBoxData_ = lunchBoxDataBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq other) {
        if (other == emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.getDefaultInstance()) return this;
        if (other.hasLunchBoxData()) {
          mergeLunchBoxData(other.getLunchBoxData());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder> lunchBoxDataBuilder_;
      /**
       * <code>.LunchBoxData lunch_box_data = 6;</code>
       * @return Whether the lunchBoxData field is set.
       */
      public boolean hasLunchBoxData() {
        return lunchBoxDataBuilder_ != null || lunchBoxData_ != null;
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 6;</code>
       * @return The lunchBoxData.
       */
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getLunchBoxData() {
        if (lunchBoxDataBuilder_ == null) {
          return lunchBoxData_ == null ? emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : lunchBoxData_;
        } else {
          return lunchBoxDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 6;</code>
       */
      public Builder setLunchBoxData(emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData value) {
        if (lunchBoxDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lunchBoxData_ = value;
          onChanged();
        } else {
          lunchBoxDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 6;</code>
       */
      public Builder setLunchBoxData(
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder builderForValue) {
        if (lunchBoxDataBuilder_ == null) {
          lunchBoxData_ = builderForValue.build();
          onChanged();
        } else {
          lunchBoxDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 6;</code>
       */
      public Builder mergeLunchBoxData(emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData value) {
        if (lunchBoxDataBuilder_ == null) {
          if (lunchBoxData_ != null) {
            lunchBoxData_ =
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.newBuilder(lunchBoxData_).mergeFrom(value).buildPartial();
          } else {
            lunchBoxData_ = value;
          }
          onChanged();
        } else {
          lunchBoxDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 6;</code>
       */
      public Builder clearLunchBoxData() {
        if (lunchBoxDataBuilder_ == null) {
          lunchBoxData_ = null;
          onChanged();
        } else {
          lunchBoxData_ = null;
          lunchBoxDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 6;</code>
       */
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder getLunchBoxDataBuilder() {
        
        onChanged();
        return getLunchBoxDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 6;</code>
       */
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder() {
        if (lunchBoxDataBuilder_ != null) {
          return lunchBoxDataBuilder_.getMessageOrBuilder();
        } else {
          return lunchBoxData_ == null ?
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : lunchBoxData_;
        }
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder> 
          getLunchBoxDataFieldBuilder() {
        if (lunchBoxDataBuilder_ == null) {
          lunchBoxDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder>(
                  getLunchBoxData(),
                  getParentForChildren(),
                  isClean());
          lunchBoxData_ = null;
        }
        return lunchBoxDataBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SetUpLunchBoxWidgetReq)
    }

    // @@protoc_insertion_point(class_scope:SetUpLunchBoxWidgetReq)
    private static final emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq();
    }

    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetUpLunchBoxWidgetReq>
        PARSER = new com.google.protobuf.AbstractParser<SetUpLunchBoxWidgetReq>() {
      @java.lang.Override
      public SetUpLunchBoxWidgetReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetUpLunchBoxWidgetReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetUpLunchBoxWidgetReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetUpLunchBoxWidgetReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetUpLunchBoxWidgetReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SetUpLunchBoxWidgetReq.proto\032\022LunchBox" +
      "Data.proto\"?\n\026SetUpLunchBoxWidgetReq\022%\n\016" +
      "lunch_box_data\030\006 \001(\0132\r.LunchBoxDataB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.getDescriptor(),
        });
    internal_static_SetUpLunchBoxWidgetReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetUpLunchBoxWidgetReq_descriptor,
        new java.lang.String[] { "LunchBoxData", });
    emu.grasscutter.net.proto.LunchBoxDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
