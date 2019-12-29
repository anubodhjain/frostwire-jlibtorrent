/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class entry_vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected entry_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(entry_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_entry_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public entry_vector() {
    this(libtorrent_jni.new_entry_vector(), true);
  }

  public long size() {
    return libtorrent_jni.entry_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.entry_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.entry_vector_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return libtorrent_jni.entry_vector_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.entry_vector_clear(swigCPtr, this);
  }

  public void push_back(entry x) {
    libtorrent_jni.entry_vector_push_back(swigCPtr, this, entry.getCPtr(x), x);
  }

  public entry get(int i) {
    return new entry(libtorrent_jni.entry_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, entry val) {
    libtorrent_jni.entry_vector_set(swigCPtr, this, i, entry.getCPtr(val), val);
  }

}
