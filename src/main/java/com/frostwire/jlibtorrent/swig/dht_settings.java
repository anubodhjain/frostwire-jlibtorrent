/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_settings {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected dht_settings(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_settings obj) {
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
        libtorrent_jni.delete_dht_settings(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMax_peers_reply(int value) {
    libtorrent_jni.dht_settings_max_peers_reply_set(swigCPtr, this, value);
  }

  public int getMax_peers_reply() {
    return libtorrent_jni.dht_settings_max_peers_reply_get(swigCPtr, this);
  }

  public void setSearch_branching(int value) {
    libtorrent_jni.dht_settings_search_branching_set(swigCPtr, this, value);
  }

  public int getSearch_branching() {
    return libtorrent_jni.dht_settings_search_branching_get(swigCPtr, this);
  }

  public void setMax_fail_count(int value) {
    libtorrent_jni.dht_settings_max_fail_count_set(swigCPtr, this, value);
  }

  public int getMax_fail_count() {
    return libtorrent_jni.dht_settings_max_fail_count_get(swigCPtr, this);
  }

  public void setMax_torrents(int value) {
    libtorrent_jni.dht_settings_max_torrents_set(swigCPtr, this, value);
  }

  public int getMax_torrents() {
    return libtorrent_jni.dht_settings_max_torrents_get(swigCPtr, this);
  }

  public void setMax_dht_items(int value) {
    libtorrent_jni.dht_settings_max_dht_items_set(swigCPtr, this, value);
  }

  public int getMax_dht_items() {
    return libtorrent_jni.dht_settings_max_dht_items_get(swigCPtr, this);
  }

  public void setMax_peers(int value) {
    libtorrent_jni.dht_settings_max_peers_set(swigCPtr, this, value);
  }

  public int getMax_peers() {
    return libtorrent_jni.dht_settings_max_peers_get(swigCPtr, this);
  }

  public void setMax_torrent_search_reply(int value) {
    libtorrent_jni.dht_settings_max_torrent_search_reply_set(swigCPtr, this, value);
  }

  public int getMax_torrent_search_reply() {
    return libtorrent_jni.dht_settings_max_torrent_search_reply_get(swigCPtr, this);
  }

  public void setRestrict_routing_ips(boolean value) {
    libtorrent_jni.dht_settings_restrict_routing_ips_set(swigCPtr, this, value);
  }

  public boolean getRestrict_routing_ips() {
    return libtorrent_jni.dht_settings_restrict_routing_ips_get(swigCPtr, this);
  }

  public void setRestrict_search_ips(boolean value) {
    libtorrent_jni.dht_settings_restrict_search_ips_set(swigCPtr, this, value);
  }

  public boolean getRestrict_search_ips() {
    return libtorrent_jni.dht_settings_restrict_search_ips_get(swigCPtr, this);
  }

  public void setExtended_routing_table(boolean value) {
    libtorrent_jni.dht_settings_extended_routing_table_set(swigCPtr, this, value);
  }

  public boolean getExtended_routing_table() {
    return libtorrent_jni.dht_settings_extended_routing_table_get(swigCPtr, this);
  }

  public void setAggressive_lookups(boolean value) {
    libtorrent_jni.dht_settings_aggressive_lookups_set(swigCPtr, this, value);
  }

  public boolean getAggressive_lookups() {
    return libtorrent_jni.dht_settings_aggressive_lookups_get(swigCPtr, this);
  }

  public void setPrivacy_lookups(boolean value) {
    libtorrent_jni.dht_settings_privacy_lookups_set(swigCPtr, this, value);
  }

  public boolean getPrivacy_lookups() {
    return libtorrent_jni.dht_settings_privacy_lookups_get(swigCPtr, this);
  }

  public void setEnforce_node_id(boolean value) {
    libtorrent_jni.dht_settings_enforce_node_id_set(swigCPtr, this, value);
  }

  public boolean getEnforce_node_id() {
    return libtorrent_jni.dht_settings_enforce_node_id_get(swigCPtr, this);
  }

  public void setIgnore_dark_internet(boolean value) {
    libtorrent_jni.dht_settings_ignore_dark_internet_set(swigCPtr, this, value);
  }

  public boolean getIgnore_dark_internet() {
    return libtorrent_jni.dht_settings_ignore_dark_internet_get(swigCPtr, this);
  }

  public void setBlock_timeout(int value) {
    libtorrent_jni.dht_settings_block_timeout_set(swigCPtr, this, value);
  }

  public int getBlock_timeout() {
    return libtorrent_jni.dht_settings_block_timeout_get(swigCPtr, this);
  }

  public void setBlock_ratelimit(int value) {
    libtorrent_jni.dht_settings_block_ratelimit_set(swigCPtr, this, value);
  }

  public int getBlock_ratelimit() {
    return libtorrent_jni.dht_settings_block_ratelimit_get(swigCPtr, this);
  }

  public void setRead_only(boolean value) {
    libtorrent_jni.dht_settings_read_only_set(swigCPtr, this, value);
  }

  public boolean getRead_only() {
    return libtorrent_jni.dht_settings_read_only_get(swigCPtr, this);
  }

  public void setItem_lifetime(int value) {
    libtorrent_jni.dht_settings_item_lifetime_set(swigCPtr, this, value);
  }

  public int getItem_lifetime() {
    return libtorrent_jni.dht_settings_item_lifetime_get(swigCPtr, this);
  }

  public void setUpload_rate_limit(int value) {
    libtorrent_jni.dht_settings_upload_rate_limit_set(swigCPtr, this, value);
  }

  public int getUpload_rate_limit() {
    return libtorrent_jni.dht_settings_upload_rate_limit_get(swigCPtr, this);
  }

  public void setSample_infohashes_interval(int value) {
    libtorrent_jni.dht_settings_sample_infohashes_interval_set(swigCPtr, this, value);
  }

  public int getSample_infohashes_interval() {
    return libtorrent_jni.dht_settings_sample_infohashes_interval_get(swigCPtr, this);
  }

  public void setMax_infohashes_sample_count(int value) {
    libtorrent_jni.dht_settings_max_infohashes_sample_count_set(swigCPtr, this, value);
  }

  public int getMax_infohashes_sample_count() {
    return libtorrent_jni.dht_settings_max_infohashes_sample_count_get(swigCPtr, this);
  }

  public dht_settings() {
    this(libtorrent_jni.new_dht_settings(), true);
  }

}
