# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # ImageManipulationModel Model.
  class ImageManipulationModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :key

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :uid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :image

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :transform

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :moderate

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['key'] = 'key'
        @_hash['uid'] = 'uid'
        @_hash['image'] = 'image'
        @_hash['transform'] = 'transform'
        @_hash['moderate'] = 'moderate'
      end
      @_hash
    end

    def initialize(key = nil,
                   uid = nil,
                   image = nil,
                   transform = nil,
                   moderate = nil,
                   additional_properties = {})
      @key = key
      @uid = uid
      @image = image
      @transform = transform
      @moderate = moderate

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      key = hash['key']
      uid = hash['uid']
      image = hash['image']
      transform = hash['transform']
      moderate = hash['moderate']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      ImageManipulationModel.new(key,
                                 uid,
                                 image,
                                 transform,
                                 moderate,
                                 hash)
    end
  end
end
