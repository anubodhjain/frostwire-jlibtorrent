/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class torrent_flags {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected torrent_flags(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(torrent_flags obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public final static long seed_mode = 0x001;
  public final static long upload_mode = 0x004;
  public final static long share_mode = 0x008;
  public final static long apply_ip_filter = 0x010;
  public final static long paused = 0x020;
  public final static long auto_managed = 0x040;
  public final static long duplicate_is_error = 0x080;
  public final static long update_subscribe = 0x200;
  public final static long super_seeding = 0x400;
  public final static long sequential_download = 0x800;
  public final static long stop_when_ready = 0x2000;
  public final static long override_trackers = 0x4000;
  public final static long override_web_seeds = 0x8000;
  public final static long need_save_resume = 0x10000;
  public final static long all = 0x7fffffffffffffffL;
}