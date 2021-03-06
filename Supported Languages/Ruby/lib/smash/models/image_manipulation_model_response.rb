# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # ImageManipulationModelResponse Model.
  class ImageManipulationModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :request

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :url

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :success

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :moderated

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :id

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['request'] = 'request'
        @_hash['url'] = 'url'
        @_hash['success'] = 'success'
        @_hash['moderated'] = 'moderated'
        @_hash['id'] = 'id'
      end
      @_hash
    end

    def initialize(request = nil,
                   url = nil,
                   success = nil,
                   moderated = nil,
                   id = nil,
                   additional_properties = {})
      @request = request
      @url = url
      @success = success
      @moderated = moderated
      @id = id

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      request = hash['request']
      url = hash['url']
      success = hash['success']
      moderated = hash['moderated']
      id = hash['id']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      ImageManipulationModelResponse.new(request,
                                         url,
                                         success,
                                         moderated,
                                         id,
                                         hash)
    end
  end
end
