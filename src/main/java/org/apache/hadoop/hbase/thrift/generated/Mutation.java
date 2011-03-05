/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.thrift.generated;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

/**
 * A Mutation object is used to either update or delete a column-value.
 */
public class Mutation implements TBase<Mutation, Mutation._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Mutation");

  private static final TField IS_DELETE_FIELD_DESC = new TField("isDelete", TType.BOOL, (short)1);
  private static final TField COLUMN_FIELD_DESC = new TField("column", TType.STRING, (short)2);
  private static final TField VALUE_FIELD_DESC = new TField("value", TType.STRING, (short)3);

  public boolean isDelete;
  public ByteBuffer column;
  public ByteBuffer value;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    IS_DELETE((short)1, "isDelete"),
    COLUMN((short)2, "column"),
    VALUE((short)3, "value");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // IS_DELETE
          return IS_DELETE;
        case 2: // COLUMN
          return COLUMN;
        case 3: // VALUE
          return VALUE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISDELETE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_DELETE, new FieldMetaData("isDelete", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.COLUMN, new FieldMetaData("column", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING        , "Text")));
    tmpMap.put(_Fields.VALUE, new FieldMetaData("value", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING        , "Text")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Mutation.class, metaDataMap);
  }

  public Mutation() {
    this.isDelete = false;

  }

  public Mutation(
    boolean isDelete,
    ByteBuffer column,
    ByteBuffer value)
  {
    this();
    this.isDelete = isDelete;
    setIsDeleteIsSet(true);
    this.column = column;
    this.value = value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Mutation(Mutation other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.isDelete = other.isDelete;
    if (other.isSetColumn()) {
      this.column = other.column;
    }
    if (other.isSetValue()) {
      this.value = other.value;
    }
  }

  public Mutation deepCopy() {
    return new Mutation(this);
  }

  @Override
  public void clear() {
    this.isDelete = false;

    this.column = null;
    this.value = null;
  }

  public boolean isIsDelete() {
    return this.isDelete;
  }

  public Mutation setIsDelete(boolean isDelete) {
    this.isDelete = isDelete;
    setIsDeleteIsSet(true);
    return this;
  }

  public void unsetIsDelete() {
    __isset_bit_vector.clear(__ISDELETE_ISSET_ID);
  }

  /** Returns true if field isDelete is set (has been asigned a value) and false otherwise */
  public boolean isSetIsDelete() {
    return __isset_bit_vector.get(__ISDELETE_ISSET_ID);
  }

  public void setIsDeleteIsSet(boolean value) {
    __isset_bit_vector.set(__ISDELETE_ISSET_ID, value);
  }

  public byte[] getColumn() {
    setColumn(TBaseHelper.rightSize(column));
    return column.array();
  }

  public ByteBuffer BufferForColumn() {
    return column;
  }

  public Mutation setColumn(byte[] column) {
    setColumn(ByteBuffer.wrap(column));
    return this;
  }

  public Mutation setColumn(ByteBuffer column) {
    this.column = column;
    return this;
  }

  public void unsetColumn() {
    this.column = null;
  }

  /** Returns true if field column is set (has been asigned a value) and false otherwise */
  public boolean isSetColumn() {
    return this.column != null;
  }

  public void setColumnIsSet(boolean value) {
    if (!value) {
      this.column = null;
    }
  }

  public byte[] getValue() {
    setValue(TBaseHelper.rightSize(value));
    return value.array();
  }

  public ByteBuffer BufferForValue() {
    return value;
  }

  public Mutation setValue(byte[] value) {
    setValue(ByteBuffer.wrap(value));
    return this;
  }

  public Mutation setValue(ByteBuffer value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been asigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_DELETE:
      if (value == null) {
        unsetIsDelete();
      } else {
        setIsDelete((Boolean)value);
      }
      break;

    case COLUMN:
      if (value == null) {
        unsetColumn();
      } else {
        setColumn((ByteBuffer)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_DELETE:
      return new Boolean(isIsDelete());

    case COLUMN:
      return getColumn();

    case VALUE:
      return getValue();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_DELETE:
      return isSetIsDelete();
    case COLUMN:
      return isSetColumn();
    case VALUE:
      return isSetValue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Mutation)
      return this.equals((Mutation)that);
    return false;
  }

  public boolean equals(Mutation that) {
    if (that == null)
      return false;

    boolean this_present_isDelete = true;
    boolean that_present_isDelete = true;
    if (this_present_isDelete || that_present_isDelete) {
      if (!(this_present_isDelete && that_present_isDelete))
        return false;
      if (this.isDelete != that.isDelete)
        return false;
    }

    boolean this_present_column = true && this.isSetColumn();
    boolean that_present_column = true && that.isSetColumn();
    if (this_present_column || that_present_column) {
      if (!(this_present_column && that_present_column))
        return false;
      if (!this.column.equals(that.column))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Mutation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Mutation typedOther = (Mutation)other;

    lastComparison = Boolean.valueOf(isSetIsDelete()).compareTo(typedOther.isSetIsDelete());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsDelete()) {
      lastComparison = TBaseHelper.compareTo(this.isDelete, typedOther.isDelete);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumn()).compareTo(typedOther.isSetColumn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumn()) {
      lastComparison = TBaseHelper.compareTo(this.column, typedOther.column);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(typedOther.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = TBaseHelper.compareTo(this.value, typedOther.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // IS_DELETE
          if (field.type == TType.BOOL) {
            this.isDelete = iprot.readBool();
            setIsDeleteIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // COLUMN
          if (field.type == TType.STRING) {
            this.column = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // VALUE
          if (field.type == TType.STRING) {
            this.value = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(IS_DELETE_FIELD_DESC);
    oprot.writeBool(this.isDelete);
    oprot.writeFieldEnd();
    if (this.column != null) {
      oprot.writeFieldBegin(COLUMN_FIELD_DESC);
      oprot.writeBinary(this.column);
      oprot.writeFieldEnd();
    }
    if (this.value != null) {
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeBinary(this.value);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Mutation(");
    boolean first = true;

    sb.append("isDelete:");
    sb.append(this.isDelete);
    first = false;
    if (!first) sb.append(", ");
    sb.append("column:");
    if (this.column == null) {
      sb.append("null");
    } else {
      sb.append(this.column);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

