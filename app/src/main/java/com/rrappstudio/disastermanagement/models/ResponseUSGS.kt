package com.rrappstudio.disastermanagement.models

import com.google.gson.annotations.SerializedName

data class ResponseUSGS(

	@field:SerializedName("features")
	val features: List<FeaturesItem?>? = null,

	@field:SerializedName("metadata")
	val metadata: Metadata? = null,

	@field:SerializedName("bbox")
	val bbox: List<Double?>? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class Metadata(

	@field:SerializedName("generated")
	val generated: Long? = null,

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("api")
	val api: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class Geometry(

	@field:SerializedName("coordinates")
	val coordinates: List<Double?>? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class Properties(

	@field:SerializedName("dmin")
	val dmin: Double? = null,

	@field:SerializedName("code")
	val code: String? = null,

	@field:SerializedName("sources")
	val sources: String? = null,

	@field:SerializedName("tz")
	val tz: Any? = null,

	@field:SerializedName("mmi")
	val mmi: Any? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("magType")
	val magType: String? = null,

	@field:SerializedName("nst")
	val nst: Int? = null,

	@field:SerializedName("sig")
	val sig: Int? = null,

	@field:SerializedName("tsunami")
	val tsunami: Int? = null,

	@field:SerializedName("mag")
	val mag: Double? = null,

	@field:SerializedName("alert")
	val alert: Any? = null,

	@field:SerializedName("gap")
	val gap: Int? = null,

	@field:SerializedName("rms")
	val rms: Double? = null,

	@field:SerializedName("place")
	val place: String? = null,

	@field:SerializedName("net")
	val net: String? = null,

	@field:SerializedName("types")
	val types: String? = null,

	@field:SerializedName("felt")
	val felt: Any? = null,

	@field:SerializedName("cdi")
	val cdi: Any? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("ids")
	val ids: String? = null,

	@field:SerializedName("time")
	val time: Long? = null,

	@field:SerializedName("detail")
	val detail: String? = null,

	@field:SerializedName("updated")
	val updated: Long? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class FeaturesItem(

	@field:SerializedName("geometry")
	val geometry: Geometry? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("properties")
	val properties: Properties? = null
)
